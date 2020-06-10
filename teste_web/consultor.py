#!/usr/bin/env python3
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.common.exceptions import NoSuchElementException, StaleElementReferenceException
import os
import time
import json
import unittest

class Consultor():
    def __init__(self):
        self.driver = webdriver.Chrome(os.getcwd() + '/chromedriver')
        self.driver.get("https://www.icarros.com.br/")
        time.sleep(5)
        btns = self.driver.find_elements_by_class_name("btn.dropdown-toggle.btn-default")

        for btn in btns:
            if btn.get_attribute("title") == "Marca":
                btn.send_keys("Jeep")
            if btn.get_attribute("title") == "Modelo":
                btn.send_keys(Keys.ESCAPE)
                time.sleep(0.5)
                btn.send_keys("Renegade")
            if btn.get_attribute("title") == "Ano min.":
                btn.send_keys("De 2016")
            if btn.get_attribute("title") == "Ano máx.":
                btn.send_keys("Até 2017")
            if btn.get_attribute("title") == "Preço min.":
                btn.send_keys("De R$ 60 mil")
            if btn.get_attribute("title") == "Preço máx.":
                btn.send_keys("Até R$ 70 mil")


            btn.send_keys(Keys.ENTER)
            time.sleep(1)

        #botao buscar
        self.driver.find_element_by_class_name("button.button--primary.button--large.button--block").click()
        time.sleep(6)

    def consulta_carro(self, i):
        #lista de anuncios
        anuncios = self.driver.find_elements_by_class_name("anuncio_container.false")
        #clica no primeiro anuncio
        loaded = False
        anuncios[i].click()
        while not loaded:
            try:
                titulo = self.driver.find_element_by_class_name("titulo-sm").text
                loaded = True
            except NoSuchElementException:
                try:
                    anuncios[i].click()
                    time.sleep(5)
                except StaleElementReferenceException:
                    time.sleep(5)


        preco = self.driver.find_element_by_class_name("preco").text
        caracteristicas = {
            "Marca": titulo.split(' ', 1)[0],
            "Modelo": titulo.split(' ', 1)[1],
            "Ano": "",
            "Cor": "",
            "Km": "",
            "Câmbio": "",
            "Preço": preco
        }

        destaques = self.driver.find_elements_by_xpath("//div[@class='card-conteudo']//li")
        for item in destaques:
            tipo = item.text.split('\n')[0]
            if tipo in caracteristicas.keys():
                caracteristicas[tipo] = item.text.split('\n')[1]

        self.driver.find_element_by_link_text("voltar para lista").click()
        time.sleep(5)
        return caracteristicas

    def quit(self):
        self.driver.quit()

if __name__ == "__main__":

    consultor = Consultor()

    carros = {}
    carros["carro1"] = consultor.consulta_carro(0)
    carros["carro2"] = consultor.consulta_carro(1)
    carros["carro3"] = consultor.consulta_carro(2)
    carros["carro4"] = consultor.consulta_carro(3)

    consultor.quit()


    with open('carros.json', 'w', encoding='utf8') as f:
        json.dump(carros, f, indent=4, ensure_ascii=False)

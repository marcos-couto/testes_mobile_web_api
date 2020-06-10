#!/usr/bin/env python3

import unittest
import json
from consultor import Consultor

with open("carros.json", 'r') as json_file:
        carroslidos = json.load(json_file)

consultor = Consultor()
carros = {}
carros["carro1"] = consultor.consulta_carro(0)
carros["carro2"] = consultor.consulta_carro(1)
carros["carro3"] = consultor.consulta_carro(2)
carros["carro4"] = consultor.consulta_carro(3)
consultor.quit()

class TestConsulta(unittest.TestCase):

    def setUp(self):
        pass

    def test_marca(self):
        self.assertEqual(carros["carro1"]["Marca"],
                         carroslidos["carro1"]["Marca"])
        self.assertEqual(carros["carro2"]["Marca"],
                         carroslidos["carro2"]["Marca"])
        self.assertEqual(carros["carro3"]["Marca"],
                         carroslidos["carro3"]["Marca"])
        self.assertEqual(carros["carro4"]["Marca"],
                         carroslidos["carro4"]["Marca"])

    def test_modelo(self):
        self.assertEqual(carros["carro1"]["Modelo"],
                     carroslidos["carro1"]["Modelo"])
        self.assertEqual(carros["carro2"]["Modelo"],
                     carroslidos["carro2"]["Modelo"])
        self.assertEqual(carros["carro3"]["Modelo"],
                     carroslidos["carro3"]["Modelo"])
        self.assertEqual(carros["carro4"]["Modelo"],
                     carroslidos["carro4"]["Modelo"])

    def test_ano(self):
        self.assertEqual(carros["carro1"]["Ano"],
                     carroslidos["carro1"]["Ano"])
        self.assertEqual(carros["carro2"]["Ano"],
                     carroslidos["carro2"]["Ano"])
        self.assertEqual(carros["carro3"]["Ano"],
                     carroslidos["carro3"]["Ano"])
        self.assertEqual(carros["carro4"]["Ano"],
                     carroslidos["carro4"]["Ano"])

    def test_cor(self):
        self.assertEqual(carros["carro1"]["Cor"],
                     carroslidos["carro1"]["Cor"])
        self.assertEqual(carros["carro2"]["Cor"],
                     carroslidos["carro2"]["Cor"])
        self.assertEqual(carros["carro3"]["Cor"],
                     carroslidos["carro3"]["Cor"])
        self.assertEqual(carros["carro4"]["Cor"],
                     carroslidos["carro4"]["Cor"])

    def test_km(self):
        self.assertEqual(carros["carro1"]["Km"],
                     carroslidos["carro1"]["Km"])
        self.assertEqual(carros["carro2"]["Km"],
                     carroslidos["carro2"]["Km"])
        self.assertEqual(carros["carro3"]["Km"],
                     carroslidos["carro3"]["Km"])
        self.assertEqual(carros["carro4"]["Km"],
                     carroslidos["carro4"]["Km"])

    def test_cambio(self):
        self.assertEqual(carros["carro1"]["Câmbio"],
                     carroslidos["carro1"]["Câmbio"])
        self.assertEqual(carros["carro2"]["Câmbio"],
                     carroslidos["carro2"]["Câmbio"])
        self.assertEqual(carros["carro3"]["Câmbio"],
                     carroslidos["carro3"]["Câmbio"])
        self.assertEqual(carros["carro4"]["Câmbio"],
                     carroslidos["carro4"]["Câmbio"])

    def test_preco(self):
        self.assertEqual(carros["carro1"]["Preço"],
                     carroslidos["carro1"]["Preço"])
        self.assertEqual(carros["carro2"]["Preço"],
                     carroslidos["carro2"]["Preço"])
        self.assertEqual(carros["carro3"]["Preço"],
                     carroslidos["carro3"]["Preço"])
        self.assertEqual(carros["carro4"]["Preço"],
                     carroslidos["carro4"]["Preço"])

if __name__ == '__main__':
    unittest.main()

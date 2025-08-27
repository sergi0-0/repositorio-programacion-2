import math

class Estadistica:
    def __init__(self, datos):
        self.__datos = datos

    def promedio(self):
        return sum(self.__datos) / len(self.__datos)

    def desviacion(self):
        prom = self.promedio()
        n = len(self.__datos)
        return math.sqrt(sum((x - prom) ** 2 for x in self.__datos) / (n - 1))


if __name__ == "__main__":
    entrada = input("Ingrese 10 números separados por espacio: ").split()
    datos = [float(x) for x in entrada]

    est = Estadistica(datos)
    print(f"El promedio es {est.promedio():.2f}")
    print(f"La desviación estándar es {est.desviacion():.6f}")

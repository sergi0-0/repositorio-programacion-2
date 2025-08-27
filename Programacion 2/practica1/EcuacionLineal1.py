import math

class EcuacionCuadratica:
    def __init__(self, a: float, b: float, c: float):
        self.__a = float(a)
        self.__b = float(b)
        self.__c = float(c)

    def getDiscriminante(self) -> float:
        return self.__b**2 - 4 * self.__a * self.__c

    def getRaiz1(self) -> float:
        d = self.getDiscriminante()
        if d < 0:
            return 0
        return (-self.__b + math.sqrt(d)) / (2 * self.__a)

    def getRaiz2(self) -> float:
        d = self.getDiscriminante()
        if d < 0:
            return 0
        return (-self.__b - math.sqrt(d)) / (2 * self.__a)


if __name__ == "__main__":
    entrada = input("Ingrese a, b, c: ").split()
    a, b, c = map(float, entrada)
    eq = EcuacionCuadratica(a, b, c)

    disc = eq.getDiscriminante()
    if disc > 0:
        print(f"La ecuación tiene dos raíces {eq.getRaiz1():.6f} y {eq.getRaiz2():.6f}")
    elif disc == 0:
        print(f"La ecuación tiene una raíz {eq.getRaiz1():.6f}")
    else:
        print("La ecuación no tiene raíces reales")

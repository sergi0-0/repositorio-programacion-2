class EcuacionLineal:
    def __init__(self, a: float, b: float, c: float, d: float, e: float, f: float):
        self.__a = float(a)
        self.__b = float(b)
        self.__c = float(c)
        self.__d = float(d)
        self.__e = float(e)
        self.__f = float(f)

    def __det(self) -> float:
        return self.__a * self.__d - self.__b * self.__c

    def tieneSolucion(self) -> bool:
        return abs(self.__det()) > 1e-12
    def getX(self) -> float:
        det = self.__det()
        if not self.tieneSolucion():
            raise ValueError("La ecuación no tiene solución")
        return (self.__e * self.__d - self.__b * self.__f) / det
    def getY(self) -> float:
        det = self.__det()
        if not self.tieneSolucion():
            raise ValueError("La ecuación no tiene solución")
        return (self.__a * self.__f - self.__e * self.__c) / det
if __name__ == "__main__":
    try:
        entrada = input("Ingrese a, b, c, d, e, f: ").strip().split()
        if len(entrada) != 6:
            raise ValueError("Debe ingresar exactamente 6 números.")
        a, b, c, d, e, f = map(float, entrada)
        eq = EcuacionLineal(a, b, c, d, e, f)

        if eq.tieneSolucion():
            x, y = eq.getX(), eq.getY()
            # Imprime como en el ejemplo
            print(f"x = {x}, y = {y}")
        else:
            print("La ecuación no tiene solución")
    except Exception as ex:
        print(ex)

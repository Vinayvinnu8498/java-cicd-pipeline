class MathUtils:
    def add(self, a, b):
        """Returns the sum of two numbers."""
        return a + b

    def subtract(self, a, b):
        """Returns the difference when b is subtracted from a."""
        return a - b

    def multiply(self, a, b):
        """Returns the product of a and b."""
        return a * b

    def divide(self, a, b):
        """Returns the quotient of a divided by b. Returns -1.0 if division by zero occurs."""
        if b == 0:
            return -1.0
        return a / b

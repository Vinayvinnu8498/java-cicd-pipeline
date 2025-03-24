import unittest
from math_utils import MathUtils  # Import MathUtils class

class TestMathUtils(unittest.TestCase):

    def setUp(self):
        """Set up an instance of MathUtils before each test."""
        self.math_utils = MathUtils()

    def test_add(self):
        self.assertEqual(self.math_utils.add(2, 3), 5)
        self.assertEqual(self.math_utils.add(-1, 1), 0)

    def test_subtract(self):
        self.assertEqual(self.math_utils.subtract(5, 3), 2)
        self.assertEqual(self.math_utils.subtract(3, 5), -2)

    def test_multiply(self):
        self.assertEqual(self.math_utils.multiply(2, 3), 6)
        self.assertEqual(self.math_utils.multiply(0, 5), 0)

    def test_divide(self):
        self.assertEqual(self.math_utils.divide(10, 2), 5.0)
        self.assertEqual(self.math_utils.divide(5, 0), -1.0)  # Handle division by zero

if __name__ == "__main__":
    unittest.main()

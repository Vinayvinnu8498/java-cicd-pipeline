from math_utils import MathUtils  # Import MathUtils class

# Create an instance of MathUtils
math_utils = MathUtils()

# Test cases
print(math_utils.add(2, 3))         # Expected Output: 5
print(math_utils.subtract(5, 3))    # Expected Output: 2
print(math_utils.multiply(4, 3))    # Expected Output: 12
print(math_utils.divide(10, 2))     # Expected Output: 5.0
print(math_utils.divide(5, 0))      # Expected Output: -1.0 (handles division by zero)

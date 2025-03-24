import pytest
from math_utils import MathUtils

@pytest.fixture
def math_utils():
    return MathUtils()

def test_add(math_utils):
    assert math_utils.add(2, 3) == 5
    assert math_utils.add(-1, 1) == 0
    assert math_utils.add(0, 0) == 0

def test_subtract(math_utils):
    assert math_utils.subtract(5, 3) == 2
    assert math_utils.subtract(3, 5) == -2
    assert math_utils.subtract(0, 0) == 0

def test_multiply(math_utils):
    assert math_utils.multiply(2, 3) == 6
    assert math_utils.multiply(-2, 3) == -6
    assert math_utils.multiply(0, 5) == 0

def test_divide(math_utils):
    assert math_utils.divide(10, 2) == 5.0
    assert math_utils.divide(9, 3) == 3.0
    assert math_utils.divide(5, 0) == -1.0

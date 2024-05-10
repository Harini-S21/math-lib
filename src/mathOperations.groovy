def add(int num1, int num2) {
    return num1 + num2
}

def subtract(int num1, int num2){
    return num1 - num2
}

def multiply(int num1, int num2) {
    return num1 * num2
}

def divide(int num1, int num2) {
    if (num2 == 0) {
        throw new IllegalArgumentException("Division by zero is not allowed")
    }
    return num1 / num2
}

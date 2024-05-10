def call(String operation, int num1, int num2) {
    switch (operation) {
        case 'add':
            return num1 + num2
        case 'subtract':
            return num1 - num2
        case 'multiply':
            return num1 * num2
        case 'divide':
            if (num2 == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed")
            }
            return num1 / num2
        default:
            throw new IllegalArgumentException("Unsupported operation: $operation")
    }
}

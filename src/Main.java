void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите a: ");
    int a = scanner.nextInt();

    System.out.print("Введите b: ");
    int b = scanner.nextInt();

    System.out.print("Введите c: ");
    int c = scanner.nextInt();

    System.out.print("Введите d: ");
    int d = scanner.nextInt();

    System.out.print("Введите e: ");
    int e = scanner.nextInt();

    System.out.print("Введите f: ");
    int f = scanner.nextInt();

    double delta = findDelta(a, e, b, d);

    if (delta == 0) {
        System.out.println("Ответа нет дельта равно 0 ");
        scanner.close();
    } else {

        System.out.println("Ответ: Х = " + findX(c, e, b, f, delta) + " Y = " + findY(a, f, c, d, delta));
        scanner.close();
    }
}

double findDelta(int a, int e, int b, int d) {
    return a*e - b*d;
}

double findX(int c, int e, int b, int f, double delta) {
    return (c*e - b*f) / delta;
}

double findY(int a, int f, int c, int d, double delta) {
    return (a*f - c*d) / delta;
}
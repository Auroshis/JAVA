public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T>0) {
    int N = sc.nextInt();
    int X = sc.nextInt();
    int count = 0;
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
    A[i] = sc.nextInt();
    if (A[i] == X) {
    count++;
    }
    }
    if (count == 0) {
    System.out.println("-1");
    } else {
    System.out.println(count);
    }
    T--;
    }
    }
    //useful when the number whose count is required is given before hand.
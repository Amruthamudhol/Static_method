class President {

    public static void govern() {
        System.out.println("President governs the nation");
        callState();
    }

    public static void callState() {
        System.out.println("Calling state governments");
        rules();
    }

    public static void rules() {
        System.out.println("Framing rules");
        check();
    }

    public static void check() {
        System.out.println("Checking implementation");
        callAdmin();
    }

    public static void callAdmin() {
        System.out.println("Calling administration");
        collect();
    }

    public static void collect() {
        System.out.println("Collecting reports");
        apply();
    }

    public static void apply() {
        System.out.println("Applying policies");
        chain();
    }

    public static void chain() {
        System.out.println("Chaining departments");
        citizen();
    }

    public static void citizen() {
        System.out.println("Interacting with citizens");
        follow();
    }

    public static void follow() {
        System.out.println("Citizens follow the rules");
    }
}

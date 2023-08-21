class FaceBook01{
    public static void main(String[] args) {
        System.out.println("Welcome to FaceBook");
        login("vittaldaskamath25@gmail.com", "password123");
        login(7019084193L, "password456");
    }

    public static void login(String emailId, String password) {
        System.out.println("Login with emailId");
    }

    public static void login(long phoneNumber, String password) {
        System.out.println("Login with phoneNumber");
    }
}
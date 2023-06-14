public class App {

    public static void main(String[] args) {

        AppImpl appImpl = new AppImpl();
        int returnedValue = appImpl.printSomeInt();
        System.out.println("~~~" + returnedValue + "~~~");
    }
}

public class AcronymLearning extends AcronymBase {

    public AcronymLearning() {
        super();
        //System.out.println("AcronymLearning Constructor");
    }

    @Override
    public void displayWelcome() {
        System.out.println("Welcome to the Acronym Learning Game!");
    }

    // Overloading example
    public void showCategory(String name) {
        System.out.println("Category Selected: " + name);
    }
}
package TryWithResources;

public class SuppresedMain {
    public static void main(String[] args){
        try(Resource r = new Resource()){
            System.out.println("Using resource...");
            System.out.println(r);
            System.out.println("Some bad is happened...");
            throw new Exception("Some bad is happened...");
        }
        catch (Exception e) {
            System.out.println("Exception is caught.");
            System.out.println("\nSuppresedExceptions:");
            Throwable[] suppressedExceptions = e.getSuppressed();
            for (int i = 0; i < suppressedExceptions.length; i++) {
                System.out.println("    " + suppressedExceptions[i].getMessage());
            }
        }
    }
}

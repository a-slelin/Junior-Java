package TryWithResources;

public class Resource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Closing resource...");
        throw new Exception("Resource closing failed.");
    }
}

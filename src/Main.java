
public class Main {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        System.out.println(pc.getName());
        System.out.println(pc.getProcessorType());
        System.out.println(pc.getMemoryCapacity());
        System.out.println(pc.getGraphicsCard());
        System.out.println(pc.getGraphicsProcessor());
        pc.setGraphicsMemory("1GB");
        System.out.println(pc.getGraphicsMemory());
    }
}
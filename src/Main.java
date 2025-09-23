//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer("4MB");
        System.out.println(pc.getName());
        System.out.println(pc.getProcessorType());
        System.out.println(pc.getMemoryCapacity());
        System.out.println(pc.getGraphicsCard());
        System.out.println(pc.getGraphicsProcessor());
        pc.setGraphicsMemory("1GB");
        System.out.println(pc.getGraphicsMemory());
    }
}
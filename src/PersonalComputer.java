public class PersonalComputer extends MainBoard implements IComputer {

    @Override
    public String getName() {
        return "Personal Computer";
    }

    @Override
    public String getProcessorType() {
        return "Intel i7 CPU x64 Family";
    }
}

public class PersonalComputer extends MainBoard implements IComputer, IGraphicalCard {

    @Override
    public String getName() {
        return "Personal Computer";
    }

    @Override
    public String getProcessorType() {
        return "Intel i7 CPU x64 Family";
    }

    @Override
    public String getGraphicsCard() {
        return "NVidia 1GB RAM Pro";
    }
}

public class PersonalComputer extends MainBoard implements IComputer, IGraphicalCard {

    private String graphicsMemory;

    public PersonalComputer() {
        graphicsMemory = "4MB";
    }

    public PersonalComputer(String graphicsMemory) {
        this.graphicsMemory = graphicsMemory;
    }

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

    @Override
    public String getGraphicsProcessor() {
        return "NVidia Compact 512Bit";
    }

    @Override
    public void setGraphicsMemory(String memory) {
        graphicsMemory = memory;
    }

    @Override
    public String getGraphicsMemory() {
        return graphicsMemory;
    }


}

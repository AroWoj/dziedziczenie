public class PersonalComputer extends MainBoard implements IComputer, IGraphicalCard {

    private String graphicsMemory;
    private String graphicsProcessor;
    private String graphicsCard;

    public PersonalComputer(String graphicsCard, String graphicsProcessor, String graphicsMemory) {
        this.graphicsCard = graphicsCard;
        this.graphicsProcessor = graphicsProcessor;
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
    public void setGraphicsProcessor(String graphicsProcessor) {
        this.graphicsProcessor = graphicsProcessor;
    }

    @Override
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String getGraphicsMemory() {
        return graphicsMemory;
    }

    public String getConfiguration() {
        return getName() + " consists of :" + this.graphicsCard + " " + this.graphicsProcessor + " " + this.graphicsMemory;
    }

}

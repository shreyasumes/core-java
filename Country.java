class Country {
    private String name;
    private int numberofStates;
    private State[] states;
    private String primeMinister;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStates(State[] states) {
        this.states = states;
    }

    public State[] getStates() {
        return states;
    }

    public void setPrimeMinister(String primeMinister) {
        this.primeMinister = primeMinister;
    }

    public String getPrimeMinister() {
        return primeMinister;
    }

    public void setNumberofStates(int numberofStates) {
        this.numberofStates = numberofStates;
    }

    public int getNumberofStates() {
        return numberofStates;
    }
}

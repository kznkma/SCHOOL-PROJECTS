class Faculty extends Employee {
    private boolean status;

    public void setStatus(boolean s) {
        this.status = s;
    }

    public boolean isRegular() {
        return this.status;
    }
}

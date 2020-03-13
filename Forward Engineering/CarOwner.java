class CarOwner {

  private String name;

  private String surname;

  private int id;

  private Car car;

  private CheckAuthentification checkA;

  private Payment payment;

    public Admin myAdmin;

  public boolean SignUp( String email, String ... cred) {
  return false;
  }

  public void Login( String email,  String password) {
  }

  public String Choose_Port( Port port) {
  return null;
  }

  public void Reserve_Port( Port port) {
  }

  public boolean Cancellation( Port port) {
  return false;
  }

  public void Rate_Port_Owner( ChargingPortOwner cpo) {
  }

  public boolean Pay() {
  return false;
  }

  public void Insert_Destination( String dest) {
  }

  public String Choose_Route( Route rout) {
    return null;
  }

  public void Insert_Specifications( Car car) {
  }

}
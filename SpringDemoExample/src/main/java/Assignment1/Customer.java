package Assignment1;

public class Customer {
  int customerId;

  String customerName;

  int customerContact;

  String customerAddress;

  /**
   * @return customerid
   */
  public int getcustomerId() {

    return this.customerId;
  }

  /**
   * @param customerid new value of {@link #getcustomerid}.
   */
  public void setcustomerId(int customerid) {

    this.customerId = customerid;
  }

  /**
   * @return customername
   */
  public String getcustomerName() {

    return this.customerName;
  }

  /**
   * @param customername new value of {@link #getcustomername}.
   */
  public void setName(String customername) {

    this.customerName = customername;
  }

  /**
   * @return contact
   */
  public int getcustomerContact() {

    return this.customerContact;
  }

  /**
   * @param customercontact new value of {@link #getcustomercontact}.
   */
  public void setcustomerContact(int customercontact) {

    this.customerContact = customercontact;
  }

  /**
   * @return customeraddress
   */
  public String getcustomerAddress() {

    return this.customerAddress;
  }

  /**
   * @param customeraddress new value of {@link #getaddress}.
   */
  public void setcustomerAddress(String customeraddress) {

    this.customerAddress = customeraddress;
  }

  public void customerDetails() {

    System.out.println("customerId:" + getcustomerAddress());
    System.out.println("customerName:" + getcustomerAddress());
    System.out.println("customerContact:" + getcustomerContact());
    System.out.println("customerAddress=(" + getcustomerAddress().getStreet() + "," + getcustomerAddress().getClass()
        + "," + getcustomerAddress().getCountry() + "," + getcustomerAddress().getZip() + ")");

  }
}

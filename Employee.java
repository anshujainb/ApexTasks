public class Employee{
    int empNo;
    String empName;
    String address; 
    String State;
    int zipCode;
    long phone; 
    String designation; //(manager, lead, analyst) 
    int experience;
    String email;
    int basic,hra,bonus ;

    public Employee(int empNo,String empName,String address,
    String State,int zipCode,long phone,String designation,int experience,String email,int basic,
    int hra,int bonous){
        this.empNo=empNo;
        this.empName=empName;
        this.address=address; 
        this.State=State;
        this.zipCode=zipCode;
        this.phone=phone; 
        this.designation=designation; //(manager, lead, analyst) 
        this.experience=experience;
        this.email=email;
        this.basic=basic;
        this.hra=hra;
        this.bonus=bonous;

    }

    /**
     * @return the empNo
     */

    public int getEmpNo() {
        return empNo;
    }
    /**
     * @param empNo the empNo to set
     */
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    /**
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @return the state
     */
    public String getState() {
        return State;
    }
    /**
     * @param state the state to set
     */
    public void setState(String state) {
        State = state;
    }
    /**
     * @return the zipCode
     */
    public int getZipCode() {
        return zipCode;
    }
    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    /**
     * @return the phone
     */
    public long getPhone() {
        return phone;
    }
    /**
     * @param phone the phone to set
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }
    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }
    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    /**
     * @return the experience
     */
    public int getExperience() {
        return experience;
    }
    /**
     * @param experience the experience to set
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the basic
     */
    public int getBasic() {
        return basic;
    }
    /**
     * @param basic the basic to set
     */
    public void setBasic(int basic) {
        this.basic = basic;
    }
    /**
     * @return the hra
     */
    public int getHra() {
        return hra;
    }
    /**
     * @param hra the hra to set
     */
    public void setHra(int hra) {
        this.hra = hra;
    }
    /**
     * @return the bonus
     */
    public int getBonus() {
        return bonus;
    }
    /**
     * @param bonus the bonus to set
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int calTotalSalary(){
        int total=basic+hra+(bonus/100)*basic;
        return total;
    }

    public static void main(String[] args) {
        Employee emp=new Employee(1, "raj", "2000 san jose 9111 ", "CA",9111,4081111111l, "Manager", 6, "rj@ab.mail",102000, 1000, 10);
        System.out.println(emp.calTotalSalary());
    }

}
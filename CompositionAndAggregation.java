class CompositionAndAggregation{
    // This code illustrate the difference between Composiotion and Aggregation relationships
    // In This example office and company are tightly coupled .i.e this is a example of Composition here Office class have no significanse if Company class is deleted
    // While for address class it is loosely coupled and it is a example to aggregation where even if Office class got deleted adress still have its own significanse and can be use anywhere else also.

    class Address{
        String city;
        String state;
        String country;
        Integer zipCode;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Integer getZipCode() {
            return zipCode;
        }

        public void setZipCode(Integer zipCode) {
            this.zipCode = zipCode;
        }
    }

    class office{
        String name;
        Address address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }
    }

    class Company{
        String name ;
        String domain;
        Address address;

        List<Office> officess ;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public List<Office> getOfficess() {
            return officess;
        }

        public void setOfficess(List<Office> officess) {
            this.officess = officess;
        }
    }
    public static void main(String[] args){
        System.out.println("This code illustrate the difference between Composiotion and Aggregation relationship...");
    }
}
package August.ex_17082024.enumclass;

public enum websiteautomation {
    Baseurl("www.vw.com"),
    dasboard("www.vm.dashboard.com"),
    login("www.vwo.login.com"),
    logout("www.logout.com");



    private String name;

    websiteautomation(String name) {
        this.name = name;
    }
    public String getName()
    {
        return name;

    }
}

public enum Enum {
    Surpise(" от удивления."),Svanteson("у Свантесонов?"),Safety("быть там в полной безопасности."),except(" Никто, кроме"),Poor("Бедняга");

    private String name;

    Enum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

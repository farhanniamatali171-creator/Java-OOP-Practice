static class Restaurant {

        private String name;
        private String city;
        private double rating;

        // Composition
        private ArrayList<MenuItem> menu = new ArrayList<>();

        public Restaurant(String name, String city, double rating) {
            this.name = name;
            this.city = city;
            this.rating = rating;
        }

        // Copy Constructor
        public Restaurant(Restaurant r) {

            this.name = r.name;
            this.city = r.city;
            this.rating = r.rating;

            for (MenuItem m : r.menu) {
                menu.add(new MenuItem(m));
            }
        }

        public String getCity() {
            return city;
        }

        // add menu item
        public void addMenuItem(MenuItem m) {
            menu.add(m);
        }

        // remove menu item
        public void removeMenuItem(MenuItem m) {
            menu.remove(m);
        }

        // show menu by category
        public void getMenuByCategory(String category) {

            for (MenuItem m : menu) {

                if (m.getCategory().equals(category)) {
                    System.out.println(m);
                }
            }
        }

        public ArrayList<MenuItem> getMenu() {
            return menu;
        }

        @Override
        public String toString() {
            return "Restaurant: " + name + " | City: " + city + " | Rating: " + rating;
        }
    }

package kiosk;

public class Kiosk {
        String mainMenu;
        String products;
        String cart;
        Boolean order;
        double price;

        public Kiosk ( ) {
            System.out.println("|Gong - cha bubble 에 오신걸 환영합니다.|");
            System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        }



        String mainMenu(String mainNumber) {
            mainMenu = mainNumber;
            return mainMenu;
        }
        String productMenu(String productNumber) {
            products = productNumber;
            return  products;
        }
        String cartMenu(String cartNumber) {
        cart = cartNumber;
        return  cart;
        }

        boolean orDer(int orderNumber) {
            order = !order;
            return order;
        }
        void fin() {
            System.out.println(" 진행하던 주문이 취소되었습니다.");
        }


}

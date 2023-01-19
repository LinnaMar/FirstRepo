package inheritanceSuperKeyword;

    class Dog extends Animal {
        public void animalSound() {
            super.animalSound(); // вызывает суперклассовую фразу
            System.out.println("The dog says: bow wow"); // добавляет свою фразу
        }
    }


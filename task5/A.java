package task5;

class A implements InetrfacetoA{ 
    String generalCharacteristics; //СОЗДАЛИ ПОЛЕ ОБЩИХ ХАРАКТЕРИСТИК
    public A(String generalCharacteristics) {
        this.generalCharacteristics = generalCharacteristics;
        print();
    }
    @Override ///ПО ПРИНЦИПУ 4("РАЗДЕЛЕНИЯ ИНТЕРФЕЙСОВ" Interface segregation principle) ПЕРЕОПРЕДЕЛИЛИ ИНТЕРФЕЙС
    public void functionTypeA(){
        System.out.println("Функции для класса А");
    };
    @Override
    public String toString(){
        return String.format("generalCharacteristics:%d", generalCharacteristics);
    }
    void print(){
        System.out.println(generalCharacteristics);
    }
}

class B extends A implements InetrfacetoB{  
    public B(String generalCharacteristics) { //ВЫЗЫВАЕМ ПОЛЕ ОБЩИХ ХАРАКТЕРИСТИК
    super(generalCharacteristics);
    
    }
    @Override  ///ПЕРЕОПРЕДЕЛИЛИ ИНТЕРФЕЙС
    public void functionTypeB(){
        System.out.println("Функции для класса Б");
    };
    
   

}

class C extends A implements InetrfacetoC{ 
    
    public C(String generalCharacteristics) { //ВЫЗЫВАЕМ ПОЛЕ ОБЩИХ ХАРАКТЕРИСТИК
        super(generalCharacteristics);
    }
    
    @Override ///ПЕРЕОПРЕДЕЛИЛИ ИНТЕРФЕЙС
    public void functionTypeC(){
        System.out.println("Функции для класса Ц");
    };
    
} 

class D extends A implements  InetrfacetoD{ 
    
    public D(String generalCharacteristics) { //ВЫЗЫВАЕМ ПОЛЕ ОБЩИХ ХАРАКТЕРИСТИК
        super(generalCharacteristics);
        
    }
    @Override ///ПЕРЕОПРЕДЕЛИЛИ ИНТЕРФЕЙС
    public void functionTypeD(){
        System.out.println("Функции для класса Д");
    };
    
}
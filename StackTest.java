public class StackTest {
    //Реализация стека с помощью массива
    private int maxsize;
    private int topelement;
    private int[] stArray;

    public StackTest(int n) {
        this.maxsize = n;
        this.topelement = -1;
        this.stArray = new int[maxsize];
    }
    public int searchTop(){ //возвращаем верхний элемент стека
        return stArray[topelement];
    }
    public void setElement(int element){ //сначала увеличиваем счетчик, а потом добавяем переданный элемент
        this.stArray[++topelement] = element;
    }
    public int deliteElement(){ //уменьшаем индекс массива=>вершиной стека становится предпоследний эл.
        return stArray[topelement--];
    }
    public boolean isEmpty(){ //проверка на пустоту массивва, т.к. изначально задавали -1
        return (topelement==-1);
    }
    public boolean isFull(){
        return (topelement==maxsize-1); //проверка на переполнение, ограничиваем длиной массива
    }
    public static void main(String[] args) {
        StackTest stack = new StackTest(5);//создание экземпляра класса стек
        stack.setElement(20);
        stack.setElement(10);
        stack.setElement(-3);
        stack.setElement(56);
        stack.setElement(48);
        stack.deliteElement();
        while (!stack.isEmpty()){
            int count = stack.deliteElement();
            System.out.print(count);
            System.out.print(" ");
        }
        System.out.println("");
        }


}


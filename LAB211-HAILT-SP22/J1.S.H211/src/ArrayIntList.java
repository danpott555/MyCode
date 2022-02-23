
import java.util.Arrays;



public class ArrayIntList {

    private int[] elementData;
    private int size;

    public ArrayIntList() {
    }

    public ArrayIntList(int[] elementData, int size) {
        this.elementData = elementData;
        this.size = size;
    }

    public int[] getElementData() {
        return elementData;
    }

    public void setElementData(int[] elementData) {
        this.elementData = elementData;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayIntList fromCount() {
        int sizeArr = 0;
        for (int i = 0; i < elementData.length; i+=2) {
            sizeArr += elementData[i];
        }
        
        int pos = 0;
        
        int[] arr = new int[sizeArr];
        for (int i = 1; i < elementData.length; i+=2) {
            int count = 0;
            while (count < elementData[i-1] && pos < sizeArr) {                
                arr[pos] = elementData[i];
                pos++;
                count++;
            }
        }
        
        ArrayIntList list = new ArrayIntList(arr, sizeArr);

        return list;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }

    

}

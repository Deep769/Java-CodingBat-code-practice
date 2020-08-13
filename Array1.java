package deep.learn;

public class Array1 {


//    1.sameFirstLast
//    Given an array of ints, return true if 6 appears as either the first or last element in the array.
//    The array will be length 1 or more.
//
//
//    firstLast6([1, 2, 6]) → true
//    firstLast6([6, 1, 2, 3]) → true
//    firstLast6([13, 6, 1, 2, 3]) → false

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

//    2.makePi
//    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
//    makePi() → [3, 1, 4]

    public int[] makePi() {
        int[] array = {3,1,4};
        return array;
    }

//    3.commonEnd
//    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
//    Both arrays will be length 1 or more.
//
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length -1] == b[b.length -1];
    }

//    4.sum3

//    Given an array of ints length 3, return the sum of all the elements.
//    sum3([1, 2, 3]) → 6
//    sum3([5, 11, 2]) → 18
//    sum3([7, 0, 0]) → 7

    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

//    5.rotateLeft3

//    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//
//
//    rotateLeft3([1, 2, 3]) → [2, 3, 1]
//    rotateLeft3([5, 11, 9]) → [11, 9, 5]
//    rotateLeft3([7, 0, 0]) → [0, 0, 7]

    public int[] rotateLeft3(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++){
            array[i] = nums[i + 1];
        }
        array[array.length -1] = nums[0];
        return array;
    }

//    6.reverse3

//    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//
//
//    reverse3([1, 2, 3]) → [3, 2, 1]
//    reverse3([5, 11, 9]) → [9, 11, 5]
//    reverse3([7, 0, 0]) → [0, 0, 7]

    public int[] reverse3(int[] nums) {
        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        return nums;
    }

//    7.maxEnd3

//    Given an array of ints length 3, figure out which is larger, the first or last element in the array,
//    and set all the other elements to be that value. Return the changed array.
//
//    maxEnd3([1, 2, 3]) → [3, 3, 3]
//    maxEnd3([11, 5, 9]) → [11, 11, 11]
//    maxEnd3([2, 11, 3]) → [3, 3, 3]

    public int[] maxEnd3(int[] nums) {
        if(nums[0] > nums[nums.length-1]){
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[0];
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[nums.length-1];
            }
        }
        return nums;
    }

//    8.sum2

//    Given an array of ints, return the sum of the first 2 elements in the array.
//    If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
//
//    sum2([1, 2, 3]) → 3
//    sum2([1, 1]) → 2
//    sum2([1, 1, 1, 1]) → 2

    public int sum2(int[] nums) {
        if(nums.length > 1){
            return nums[0] + nums[1];
        } else if(nums.length == 1){
            return nums[0];
        }
        return 0;
    }

//    9.middleWay

//    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
//
//    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
//    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
//    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

    public int[] middleWay(int[] a, int[] b) {
        int[] array = {a[1], b[1]};
        return array;
    }

//    10.makeEnds

//    Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
//    The original array will be length 1 or more.
//
//    makeEnds([1, 2, 3]) → [1, 3]
//    makeEnds([1, 2, 3, 4]) → [1, 4]
//    makeEnds([7, 4, 6, 2]) → [7, 2]

    public int[] makeEnds(int[] nums) {
        int[] array = {nums[0],nums[nums.length -1]};
        return array;
    }

//    11.has23

//    Given an int array length 2, return true if it contains a 2 or a 3.
//
//    has23([2, 5]) → true
//    has23([4, 3]) → true
//    has23([4, 5]) → false

    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

//    12.no23


//    Given an int array length 2, return true if it does not contain a 2 or 3.
//
//    no23([4, 5]) → true
//    no23([4, 2]) → false
//    no23([3, 5]) → false

    public boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }

//    13.makeLast


//    Given an int array, return a new array with double the length where its last element
//    is the same as the original array, and all the other elements are 0. The original array
//    will be length 1 or more. Note: by default, a new int array contains all 0's.
//
//    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//    makeLast([1, 2]) → [0, 0, 0, 2]
//    makeLast([3]) → [0, 3]

    public int[] makeLast(int[] nums) {
        int[] newArray = new int[nums.length * 2];
        for(int i = 0; i < newArray.length -1; i++){
            newArray[i] = 0;
        }
        newArray[newArray.length-1] = nums[nums.length -1];
        return newArray;
    }

//    14.double23

//    Given an int array, return true if the array contains 2 twice, or 3 twice.
//    The array will be length 0, 1, or 2.
//
//    double23([2, 2]) → true
//    double23([3, 3]) → true
//    double23([2, 3]) → false

    public boolean double23(int[] nums) {
        if(nums.length > 1){
            return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
        }
        return false;
    }

//    15.fix23

//    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
//    Return the changed array.
//
//    fix23([1, 2, 3]) → [1, 2, 0]
//    fix23([2, 3, 5]) → [2, 0, 5]
//    fix23([1, 2, 1]) → [1, 2, 1]

    public int[] fix23(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2 && nums[i+1] == 3){
                nums[i+1]=0;
            }
        }
        return nums;
    }

//    16.start1


//    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
//
//
//    start1([1, 2, 3], [1, 3]) → 2
//    start1([7, 2, 3], [1]) → 1
//    start1([1, 2], []) → 1

    public int start1(int[] a, int[] b) {
        int total = 0;
        if(a.length != 0){
            if(a[0] == 1){
                total++;
            }
        }
        if(b.length != 0){
            if(b[0] == 1){
                total++;
            }
        }
        return total;
    }

//    17.biggerTwo

//    Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
//    Return the array which has the largest sum. In event of a tie, return a.
//
//    biggerTwo([1, 2], [3, 4]) → [3, 4]
//    biggerTwo([3, 4], [1, 2]) → [3, 4]
//    biggerTwo([1, 1], [1, 2]) → [1, 2]

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();
        if (sumA >= sumB){
            return a;
        }
        return b;
    }

//    18.makeMiddle

//    Given an array of ints of even length, return a new array length 2 containing the middle
//    two elements from the original array. The original array will be length 2 or more.
//
//    makeMiddle([1, 2, 3, 4]) → [2, 3]
//    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
//    makeMiddle([1, 2]) → [1, 2]

    public int[] makeMiddle(int[] nums) {
        int index1 = (nums.length / 2) -1;
        int index2 = (nums.length / 2);
        int[] newArray = {nums[index1],nums[index2]};
        return newArray;
    }

//    19.plusTwo

//    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
//
//    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
//    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
//    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

    public int[] plusTwo(int[] a, int[] b) {
        int[] newArray = {a[0],a[1],b[0],b[1]};
        return newArray;
    }

//    20.swapEnds

//    Given an array of ints, swap the first and last elements in the array. Return the modified array.
//    The array length will be at least 1.
//
//    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
//    swapEnds([1, 2, 3]) → [3, 2, 1]
//    swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]

    public int[] swapEnds(int[] nums) {
        int[] newArray = new int[nums.length];
        for(int i = 1; i<nums.length -1; i++){
            newArray[i]= nums[i];
        }
        newArray[0] = nums[nums.length- 1];
        newArray[newArray.length -1] = nums[0];
        return newArray;
    }

//    21.midThree

//    Given an array of ints of odd length, return a new array length 3 containing the elements
//    from the middle of the array. The array length will be at least 3.
//
//    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
//    midThree([1, 2, 3]) → [1, 2, 3]

    public int[] midThree(int[] nums) {
        int index1 = (nums.length / 2) -1;
        int index2 = (nums.length / 2);
        int index3 = (nums.length / 2) + 1;
        int[] newArray = {nums[index1], nums[index2], nums[index3]};
        return newArray;
    }

//    22.maxTriple

//    Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
//
//    maxTriple([1, 2, 3]) → 3
//    maxTriple([1, 5, 3]) → 5
//    maxTriple([5, 2, 3]) → 5

    public int maxTriple(int[] nums) {

        int[] newArray = {nums[0], nums[nums.length -1], nums[nums.length/2]};
        int max = 0;
        for(int i = 0; i<newArray.length; i++){
            if(newArray[i] > max){
                max = newArray[i];
            }
        }
        return max;
    }

//    23.frontPiece

//    Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
//
//    frontPiece([1, 2, 3]) → [1, 2]
//    frontPiece([1, 2]) → [1, 2]
//    frontPiece([1]) → [1]

    public int[] frontPiece(int[] nums) {
        if(nums.length > 1){
            int[] newArray = {nums[0], nums[1]};
            return newArray;
        }
        return nums;
    }

//    24.unlucky1

//    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
//    Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
//
//    unlucky1([1, 3, 4, 5]) → true
//    unlucky1([2, 1, 3, 4, 5]) → true
//    unlucky1([1, 1, 1]) → false

    public boolean unlucky1(int[] nums) {
        if (nums.length > 1){
            if((nums[0] == 1 && nums[1] == 3) ||
                    (nums[1] == 1 && nums[2] == 3) ||
                    (nums[nums.length -2] == 1 && nums[nums.length -1] == 3)){return true;}
        }
        return false;
    }

//    25.make2

//    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
//    the elements from a followed by the elements from b. The arrays may be any length, including 0,
//    but there will be 2 or more elements available between the 2 arrays.
//
//    make2([4, 5], [1, 2, 3]) → [4, 5]
//    make2([4], [1, 2, 3]) → [4, 1]
//    make2([], [1, 2]) → [1, 2]

    public int[] make2(int[] a, int[] b) {
        if(a.length == 0){
            int[] newArray = {b[0],b[1]};
            return newArray;
        }
        if(b.length == 0){
            int[] newArray = {a[0], a[1]};
            return newArray;
        }
        if(a.length == 1 && b.length >1){
            int[] newArray = {a[0],b[0]};
            return newArray;
        }
        if(a.length == 1 && b.length ==1){
            int[] newArray = {a[0],b[0]};
            return newArray;
        }
        if(a.length > 1 && b.length > 1){
            int[] newArray = {a[0], a[1]};
            return newArray;
        }
        int[] newArray = {b[0],b[1]};
        return newArray;
    }

//    25.front11


//    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
//    If either array is length 0, ignore that array.
//
//    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
//    front11([1], [2]) → [1, 2]
//    front11([1, 7], []) → [1]

    public int[] front11(int[] a, int[] b) {
        if(a.length == 0 && b.length == 0){
            return a;
        }
        if(a.length == 0){
            int[] newArray = {b[0]};
            return newArray;
        } else if (b.length == 0){
            int[] newArray = {a[0]};
            return newArray;
        }
        int[] newArray = {a[0],b[0]};
        return newArray;
    }
}

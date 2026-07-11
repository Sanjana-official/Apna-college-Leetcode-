class Code193 {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) 
    {
        int iCount = 0;

        int low = 0; 
        int high = plants.length - 1;
        int iValue1 = capacityA;
        int iValue2 = capacityB;

        while(low <= high)
        {
            if(low == high)
            {
                if(iValue1 >= plants[low])
                {
                    return iCount;
                }
                else if(iValue2 >= plants[high])
                {
                    return iCount;
                }
                else 
                {
                    return iCount + 1;
                }
            }

            if(iValue1 < plants[low])
            {
                iCount++;
                iValue1 = capacityA - plants[low];
                low++;
            }
            else
            {
                iValue1 = iValue1 - plants[low];
                low++;
            }

            if(iValue2 < plants[high])
            {
                iCount++;
                iValue2 = capacityB - plants[high];
                high--;
            }
            else
            {
                iValue2 = iValue2 - plants[high];
                high--;
            }

        }
        return iCount;
    }
}

function colorPatternTimes(colors)
{
  let x=0;
  let prev=colors[0];
  for(i=0;i<colors.length; i++)
  {
    x+=2;
    
    if(colors[i]!=prev)
    {
      x+=1;
    }
    prev=colors[i];
  }
  return x;
}
console.log(colorPatternTimes(["Red", "Blue", "Red", "Blue", "Red"]));
console.log(colorPatternTimes(["Blue"]));
console.log(colorPatternTimes(["Red", "Yellow", "Green", "Blue"]));
console.log(colorPatternTimes(["Blue", "Blue", "Blue", "Red", "Red", "Red"]));
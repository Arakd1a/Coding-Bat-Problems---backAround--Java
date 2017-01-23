public String backAround(String str) {
  char charString = str.charAt(str.length()-1);
  return charString + str + charString;
}

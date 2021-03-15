/*package Webautomation;

public class InputStream_To_String {

	
	
	Ways to convert an InputStream to a String:

		Using IOUtils.toString (Apache Utils)

		 String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
		Using CharStreams (Guava)

		 String result = CharStreams.toString(new InputStreamReader(
		       inputStream, Charsets.UTF_8));
		Using Scanner (JDK)

		 Scanner s = new Scanner(inputStream).useDelimiter("\\A");
		 String result = s.hasNext() ? s.next() : "";
		Using Stream API (Java 8). Warning: This solution converts different line breaks (like \r\n) to \n.

		 String result = new BufferedReader(new InputStreamReader(inputStream))
		   .lines().collect(Collectors.joining("\n"));
		Using parallel Stream API (Java 8). Warning: This solution converts different line breaks (like \r\n) to \n.

		 String result = new BufferedReader(new InputStreamReader(inputStream))
		    .lines().parallel().collect(Collectors.joining("\n"));
		Using InputStreamReader and StringBuilder (JDK)

		 int bufferSize = 1024;
		 char[] buffer = new char[bufferSize];
		 StringBuilder out = new StringBuilder();
		 Reader in = new InputStreamReader(stream, StandardCharsets.UTF_8);
		 for (int numRead; (numRead = in.read(buffer, 0, buffer.length)) > 0; ) {
		     out.append(buffer, 0, numRead);
		 }
		 return out.toString();
		Using StringWriter and IOUtils.copy (Apache Commons)

		 StringWriter writer = new StringWriter();
		 IOUtils.copy(inputStream, writer, "UTF-8");
		 return writer.toString();
		Using ByteArrayOutputStream and inputStream.read (JDK)

		 ByteArrayOutputStream result = new ByteArrayOutputStream();
		 byte[] buffer = new byte[1024];
		 for (int length; (length = inputStream.read(buffer)) != -1; ) {
		     result.write(buffer, 0, length);
		 }
		 // StandardCharsets.UTF_8.name() > JDK 7
		 return result.toString("UTF-8");
		Using BufferedReader (JDK). Warning: This solution converts different line breaks (like \n\r) to line.separator system property (for example, in Windows to "\r\n").

		 String newLine = System.getProperty("line.separator");
		 BufferedReader reader = new BufferedReader(
		         new InputStreamReader(inputStream));
		 StringBuilder result = new StringBuilder();
		 for (String line; (line = reader.readLine()) != null; ) {
		     if (result.length() > 0) {
		         result.append(newLine);
		     }
		     result.append(line);
		 }
		 return result.toString();
		Using BufferedInputStream and ByteArrayOutputStream (JDK)

		BufferedInputStream bis = new BufferedInputStream(inputStream);
		ByteArrayOutputStream buf = new ByteArrayOutputStream();
		for (int result = bis.read(); result != -1; result = bis.read()) {
		    buf.write((byte) result);
		}
		// StandardCharsets.UTF_8.name() > JDK 7
		return buf.toString("UTF-8");
		Using inputStream.read() and StringBuilder (JDK). Warning: This solution has problems with Unicode, for example with Russian text (works correctly only with non-Unicode text)

		StringBuilder sb = new StringBuilder();
		for (int ch; (ch = inputStream.read()) != -1; ) {
		    sb.append((char) ch);
		}
		return sb.toString();
		Warning:

		Solutions 4, 5 and 9 convert different line breaks to one.

		Solution 11 can't work correctly with Unicode text
}














//About BUFFERED READER
  BufferedReader reads a couple of characters from the Input Stream and stores them in a buffer.

InputStreamReader reads only one character from the input stream and the remaining characters still remain in the streams hence There is no buffer in this case.
BufferedReader is a class in Java that reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, lines and arrays. The buffer size may be specified. If not, the default size, which is predefined, may be used.

In general, each read request made of a Reader causes a corresponding read request to be made of the underlying character or byte stream. It is therefore good practice to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. For example,

FileReader reader = new FileReader(“MyFile.txt”);
BufferedReader bufferedReader = new BufferedReader(reader);

//INPUT STREAM VS INPUTSTREAM READER

InputStream::read reads a single byte and returns it as an int while 
InputStreamReader::read reads a single char (respecting the encoding) and returns this as an int.




*/
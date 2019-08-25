package _01_introduction;

class CustomException extends Exception {
	void terminate() {
		System.exit(0);
	}
}
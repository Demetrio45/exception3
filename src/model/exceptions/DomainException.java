package model.exceptions;

//POSSO USAR RUNTIMEXCEPTION,  mas ai NÃO tenho que tratar as exceções,
//com EXCEPTION, tenho quer tratar as exceções com TRY CATCH

public class DomainException extends Exception{
	
	//OBRIGADO A TRATAR A EXCEÇÃO, devido a opção extends Exception
	
	private static final long serialVersionUID = 1L;

		public DomainException(String mgs) {
			super(mgs);
		}
}

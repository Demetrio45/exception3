package model.exceptions;

//POSSO USAR RUNTIMEXCEPTION,  mas ai N�O tenho que tratar as exce��es,
//com EXCEPTION, tenho quer tratar as exce��es com TRY CATCH

public class DomainException extends Exception{
	
	//OBRIGADO A TRATAR A EXCE��O, devido a op��o extends Exception
	
	private static final long serialVersionUID = 1L;

		public DomainException(String mgs) {
			super(mgs);
		}
}

package kodlamaio.HumanRMS.core.utilities.adapters;

import org.springframework.stereotype.Service;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisServiceAdapter implements ValidationService {

	@Override
	public boolean validateByMernis(String firstName, String lastName, long nationalityId, int birthYear) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(nationalityId, firstName, lastName, birthYear);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}
		
	

}

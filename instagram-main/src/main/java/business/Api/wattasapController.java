package business.Api;
    
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Api/wattasap")
public class wattasapController<Wattasap> {
	private WatchService WattasapService;
	@Autowired
	public void WattasapController(WatchService  wattasapService) {
		this.WattasapService=wattasapService;
	}
	@GetMapping("/getall")
	public ArrayList<Wattasap>allWattasap(){
		return  new ArrayList<Wattasap>(watchService());
		
		
	}
	private Collection<? extends Wattasap> watchService() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

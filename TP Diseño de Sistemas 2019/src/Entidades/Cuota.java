package Entidades;

import javax.persistence.*;

@Entity
public class Cuota {
	
	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="sec_id", initialValue=2000, allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
	private int idCuota;
	private int nroCuota;
	private String ultimoDiaPago;
	private float importeCuota;
	private boolean estaPago;
	private float recargosPorMora;
	private float bonificacion;

	public Cuota(int idCuota, int nroCuota, String ultimoDiaPago, float importeCuota, boolean estaPago,
			float recargosPorMora, float bonificacion) {
		super();
		this.idCuota = idCuota;
		this.nroCuota = nroCuota;
		this.ultimoDiaPago = ultimoDiaPago;
		this.importeCuota = importeCuota;
		this.estaPago = estaPago;
		this.recargosPorMora = recargosPorMora;
		this.bonificacion = bonificacion;
	}

	public Cuota() {
		
	}
	


	@Override
	public String toString() {
		return "Cuota [idCuota=" + idCuota + ", nroCuota=" + nroCuota + ", ultimoDiaPago=" + ultimoDiaPago
				+ ", importeCuota=" + importeCuota + ", estaPago=" + estaPago + "]";
	}

	public Cuota(int nroCuota,String tipo,String fechaVigencia,float importePoliza) {
		
		//CORREGIR CON CALENDAR
		String anioactual= fechaVigencia.substring(0, 4);
        int anio = Integer.parseInt(anioactual);
        String diaactual= fechaVigencia.substring(8,10);
        int dia = Integer.parseInt(diaactual);
        String mesactual= fechaVigencia.substring(5, 7);
        int mes = Integer.parseInt(mesactual);
        
		if(tipo.compareTo("M")==0) {
			
			mes=nroCuota+mes-1;
			
			if(mes==13) {
				mes=1;
			} else if(mes==14) {
				mes=2;
			} else if(mes==15) {
				mes=3;
			} else if(mes==16) {
				mes=4;
			} else if(mes==17) {
				mes=5;
			} else if(mes==18) {
				mes=6;
			}
			
			if(dia==1) {
				if(mes==1||mes==2||mes==4||mes==6||mes==8||mes==9||mes==11) {
					dia = 31;
					if(mes==1) {
						mes=12;
						anio--;
					}
				}else if(mes==5||mes==7||mes==10||mes==12) {
					dia = 30;
				}else if(mes==3) {
					dia = 28;
				}
			}
			
			String anioString = String.valueOf(anio);  
			String mesString = String.valueOf(mes);
			String diaString = String.valueOf(dia);
			String fechaCuota = (anioString.concat(mesString)).concat(diaString);
			
			this.nroCuota = nroCuota;
			this.ultimoDiaPago = fechaCuota;
			this.importeCuota = (float) importePoliza/6;
			this.estaPago = false;
			this.recargosPorMora = 0;
			this.bonificacion = 0;
			
		}else if(tipo.compareTo("S")==0) {

			if(dia==1) {
				if(mes==1||mes==2||mes==4||mes==6||mes==8||mes==9||mes==11) {
					dia = 31;
					if(mes==1) {
						mes=12;
						anio--;
					}
				}else if(mes==5||mes==7||mes==10||mes==12) {
					dia = 30;
				}else if(mes==3) {
					dia = 28;
				}
			}
			
			String anioString = String.valueOf(anio);  
			String mesString = String.valueOf(mes);
			String diaString = String.valueOf(dia);
			String fechaCuota = (anioString.concat(mesString)).concat(diaString);
			
			this.nroCuota = nroCuota;
			this.ultimoDiaPago = fechaCuota;
			this.importeCuota = (float) importePoliza;
			this.estaPago = false;
			this.recargosPorMora = 0;
			this.bonificacion = 0;
			
		}
	}
	
	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}

	public String getUltimoDiaPago() {
		return ultimoDiaPago;
	}

	public void setUltimoDiaPago(String ultimoDiaPago) {
		this.ultimoDiaPago = ultimoDiaPago;
	}

	public float getImporteCuota() {
		return importeCuota;
	}

	public void setImporteCuota(float importeCuota) {
		this.importeCuota = importeCuota;
	}

	public boolean isEstePago() {
		return estaPago;
	}

	public void setEstePago(boolean estePago) {
		this.estaPago = estePago;
	}

	public int getIdCuota() {
		return idCuota;
	}

	public void setIdCuota(int idCuota) {
		this.idCuota = idCuota;
	}

	public boolean isEstaPago() {
		return estaPago;
	}

	public void setEstaPago(boolean estaPago) {
		this.estaPago = estaPago;
	}

	public float getRecargosPorMora() {
		return recargosPorMora;
	}

	public void setRecargosPorMora(float recargosPorMora) {
		this.recargosPorMora = recargosPorMora;
	}

	public float getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}
	
	
}

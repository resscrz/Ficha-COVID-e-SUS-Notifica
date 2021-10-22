import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.FileOutputStream;

public class pag2campo {
    
    public void campos2(){
        
        try {
		   
                   PdfReader pdfReader =new PdfReader("C:\\FICHASYS\\TEMP1-2.pdf");
                   PdfStamper pdfStamper = new PdfStamper(pdfReader,new FileOutputStream("C:\\FICHASYS\\TEMP2-2.pdf"));
                   BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_ROMAN ,BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
                   PdfContentByte pageContentByte2 = pdfStamper.getOverContent(2);
        
                        //PAGINA 2
                        //Estado do teste Solicitado
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(103, 542);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Estado do teste Concluído
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(192, 542);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Estado do teste Coletado
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(104, 530);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Estado do teste Não Solicitado
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(192, 530);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Data da coleta DIA
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(278, 531);
			pageContentByte2.showText("31");
			pageContentByte2.endText();
                        
                        //Data da coleta MES
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(295, 531);
			pageContentByte2.showText("12");
			pageContentByte2.endText();
                        
                        //Data da coleta ANO
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(310, 531);
			pageContentByte2.showText("2022");
			pageContentByte2.endText();
                        
                        //Fabricante
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(350, 535);
			pageContentByte2.showText("FIOCRUZ");
			pageContentByte2.endText();
                        
                        //Lote
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(484, 535);
			pageContentByte2.showText("123456789");
			pageContentByte2.endText();
                        
                        //Resultado Não reagente
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(649, 542);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Resultado Reagente
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(732, 542);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Resultado Inconclusivo ou Indeterminado
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(649, 531);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Evolução do caso Cancelado
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(25, 488);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Evolução do caso Em tratamento domiciliar
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(97, 488);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Evolução do caso Cura
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(224, 488);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Evolução do caso Internado
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(25, 477);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Evolução do caso Internado em UTI 
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(97, 477);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Evolução do caso Obito
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(25, 465);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Evolução do caso Ignorado
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(97, 465);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Classificação final Descartado
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(288, 488);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Classificação final Confirmado Clínico-Imagem
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(490, 488);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Classificação final Confirmado Clínico-Epidemiológico
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(288, 477);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Classificação final Confirmado Por Critério Clínico
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(490, 477);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Classificação final Confirmado Laboratorial
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(288, 465);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Classificação final  Síndrome Gripal Não Especificada
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(490, 465);
			pageContentByte2.showText("X");
			pageContentByte2.endText();
                        
                        //Data de encerramento:DIA
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(690, 466);
			pageContentByte2.showText("31");
			pageContentByte2.endText();
                        
                        //Data de encerramento:MES
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(713, 466);
			pageContentByte2.showText("12");
			pageContentByte2.endText();
                        
                        //Data de encerramento:ANO
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(740, 466);
			pageContentByte2.showText("2021");
			pageContentByte2.endText();
                        
                        //INFORMAÇÕES COMPLEMENTARES E OBSERVAÇÕES LINHA1
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(18, 433);
			pageContentByte2.showText("0123456789ABCDEFGHIJKLMNOPQRSTUVXYWZÇ");
			pageContentByte2.endText();
                        
                        //INFORMAÇÕES COMPLEMENTARES E OBSERVAÇÕES LINHA2
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(18, 422);
			pageContentByte2.showText("0123456789ABCDEFGHIJKLMNOPQRSTUVXYWZÇ");
			pageContentByte2.endText();
                        
                        //INFORMAÇÕES COMPLEMENTARES E OBSERVAÇÕES LINHA3
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(18, 411);
			pageContentByte2.showText("0123456789ABCDEFGHIJKLMNOPQRSTUVXYWZÇ");
			pageContentByte2.endText();
                        
                        //INFORMAÇÕES COMPLEMENTARES E OBSERVAÇÕES LINHA4
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(18, 400);
			pageContentByte2.showText("0123456789ABCDEFGHIJKLMNOPQRSTUVXYWZÇ");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS ID do caso Fonte 1
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(18, 316);
			pageContentByte2.showText("999999");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS ID do contato 1
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(98, 316);
			pageContentByte2.showText("999999");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Nome completo do contato 1
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(173, 316);
			pageContentByte2.showText("JOSE DAS COUVES SILVA SAURO");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS CPF do contato 1
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(358, 316);
			pageContentByte2.showText("587.749.892-45");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Telefone 1 1
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(466, 316);
			pageContentByte2.showText("5511987654321");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Telefone 2 1
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(565, 316);
			pageContentByte2.showText("5511987654321");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Relação com o caso [1] Domiciliar; [2] Familiar (extradomiciliar); [3] Laboral; [4] Escolar; [5] Evento Social; [6] Outros. 1 
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(700, 318);
			pageContentByte2.showText("6");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Data do último contato 1
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(755, 316);
			pageContentByte2.showText("31/12/2021");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS ID do caso Fonte 2
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(18, 300);
			pageContentByte2.showText("999999");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS ID do contato 2
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(98, 300);
			pageContentByte2.showText("999999");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Nome completo do contato 2
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(173, 300);
			pageContentByte2.showText("JOSE DAS COUVES SILVA SAURO");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS CPF do contato 2
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(358, 300);
			pageContentByte2.showText("587.749.892-45");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Telefone 1 2
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(466, 300);
			pageContentByte2.showText("5511987654321");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Telefone 2 2
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(565, 300);
			pageContentByte2.showText("5511987654321");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Relação com o caso [1] Domiciliar; [2] Familiar (extradomiciliar); [3] Laboral; [4] Escolar; [5] Evento Social; [6] Outros. 2 
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(700, 303);
			pageContentByte2.showText("6");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Data do último contato 2
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(755, 300);
			pageContentByte2.showText("31/12/2021");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS ID do caso Fonte 3
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(18, 286);
			pageContentByte2.showText("999999");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS ID do contato 3
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(98, 286);
			pageContentByte2.showText("999999");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Nome completo do contato 3
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(173, 286);
			pageContentByte2.showText("JOSE DAS COUVES SILVA SAURO");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS CPF do contato 3
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(358, 286);
			pageContentByte2.showText("587.749.892-45");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Telefone 1 3
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(466, 286);
			pageContentByte2.showText("5511987654321");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Telefone 2 3
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(565, 286);
			pageContentByte2.showText("5511987654321");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Relação com o caso [1] Domiciliar; [2] Familiar (extradomiciliar); [3] Laboral; [4] Escolar; [5] Evento Social; [6] Outros. 3 
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(700, 288);
			pageContentByte2.showText("6");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Data do último contato 3
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(755, 286);
			pageContentByte2.showText("31/12/2021");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS ID do caso Fonte 4
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(18, 271);
			pageContentByte2.showText("999999");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS ID do contato 4
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(98, 271);
			pageContentByte2.showText("999999");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Nome completo do contato 4
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(173, 271);
			pageContentByte2.showText("JOSE DAS COUVES SILVA SAURO");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS CPF do contato 4
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(358, 271);
			pageContentByte2.showText("587.749.892-45");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Telefone 1 4
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(466, 271);
			pageContentByte2.showText("5511987654321");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Telefone 2 4
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(565, 271);
			pageContentByte2.showText("5511987654321");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Relação com o caso [1] Domiciliar; [2] Familiar (extradomiciliar); [3] Laboral; [4] Escolar; [5] Evento Social; [6] Outros. 4 
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(700, 273);
			pageContentByte2.showText("6");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Data do último contato 4
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(755, 271);
			pageContentByte2.showText("31/12/2021");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS ID do caso Fonte 5
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(18, 255);
			pageContentByte2.showText("999999");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS ID do contato 5
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(98, 255);
			pageContentByte2.showText("999999");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Nome completo do contato 5
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(173, 255);
			pageContentByte2.showText("JOSE DAS COUVES SILVA SAURO");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS CPF do contato 5
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(358, 255);
			pageContentByte2.showText("587.749.892-45");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Telefone 1 5
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(466, 255);
			pageContentByte2.showText("5511987654321");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Telefone 2 5
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(565, 255);
			pageContentByte2.showText("5511987654321");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Relação com o caso [1] Domiciliar; [2] Familiar (extradomiciliar); [3] Laboral; [4] Escolar; [5] Evento Social; [6] Outros. 5 
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(700, 257);
			pageContentByte2.showText("6");
			pageContentByte2.endText();
                        
                        //RASTREAMENTO DE CONTATOS Data do último contato 5
                        pageContentByte2.beginText();
			pageContentByte2.setFontAndSize(baseFont,8);
			pageContentByte2.setTextMatrix(755, 255);
			pageContentByte2.showText("31/12/2021");
			pageContentByte2.endText();
                        
                        pdfStamper.close();
                        
                            System.out.println("Foi");
		} catch (Exception e) {
		    e.printStackTrace();
		}
                        
        
    }
    
}

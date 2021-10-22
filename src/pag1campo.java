
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.FileOutputStream;


public class pag1campo {
 
    public void campos1(){
        try {
		   PdfReader pdfReader =new PdfReader("C:\\FICHASYS\\Ficha-COVID-e-SUS-Notifica_16_08_21.pdf");
                   PdfStamper pdfStamper = new PdfStamper(pdfReader,new FileOutputStream("C:\\FICHASYS\\TEMP1-2.pdf"));
                   BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_ROMAN ,BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
                   PdfContentByte pageContentByte =pdfStamper.getOverContent(1);
                     
                        //SERIE
                        pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(445, 807);
			pageContentByte.showText("SERIE");
			pageContentByte.endText();
                        
                        //Município de Notificação
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(125, 692);
			pageContentByte.showText("CIDADE");
			pageContentByte.endText();
                        
                        //UF de notificação: S
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(322, 692);
			pageContentByte.showText("S");
			pageContentByte.endText();
                        
                        //UF de notificação: P
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(334, 692);
			pageContentByte.showText("P");
			pageContentByte.endText();
                        
                        //Data da Notificação: DIA
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(490, 692);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Data da Notificação: MES
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(508, 692);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Data da Notificação: ANO
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(525, 692);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //Tem CPF? Sim
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(32, 669);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Tem CPF? Não
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(65, 669);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Estrangeiro:Sim
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(137, 669);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Estrangeiro:Não
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(172, 669);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Profissional de saúde:Sim
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(252, 669);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Profissional de saúde:Nao
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(287, 669);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Profissional de segurança:Sim
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(415, 669);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Profissional de segurança:Nao
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(450, 669);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //CPF:1
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(47, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CPF:2
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(60, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CPF:3
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(73, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CPF:4
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(86, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CPF:5
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(100, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CPF:6
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(113, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CPF:7
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(126, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CPF:8
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(139, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CPF:9
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(152, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CPF:10
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(165, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CPF:11
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(178, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CNS:1
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(219, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:2
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(231, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:3
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(244, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:4
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(257, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:5
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(271, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:6
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(284, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:7
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(297, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:8
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(310, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:9
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(324, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:10
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(337, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:11
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(350, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:12
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(363, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:13
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(376, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                         //CNS:14
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(389, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //Passaporte:A
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(457, 657);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Passaporte:B
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(470, 657);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Passaporte:1
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(483, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //Passaporte:2
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(496, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //Passaporte:3
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(509, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //Passaporte:4
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(523, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //Passaporte:5
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(536, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //Passaporte:6
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(549, 657);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //Ocupação (CBO)
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(92, 645);
			pageContentByte.showText("ABCDEFGHIJKLMNOPQRSTUVXZ");
			pageContentByte.endText();
                        
                        //Nome Completo
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(92, 635);
			pageContentByte.showText("ABCDEFGHIJKLMNOPQRSTUVXZ");
			pageContentByte.endText();
                        
                        //Nome Completo da Mãe
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(122, 623);
			pageContentByte.showText("ABCDEFGHIJKLMNOPQRSTUVXZ");
			pageContentByte.endText();
                        
                        //Data de nascimento DIA
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(113, 612);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Data de nascimento MES
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(133, 612);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Data de nascimento ANO
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(153, 612);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //País de origem
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(284, 611);
			pageContentByte.showText("LIXO");
			pageContentByte.endText();
                        
                        //Sexo M
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(32, 589);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sexo F
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(100, 589);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Raca/Cor:Branca
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(230, 600);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Raca/Cor:Preta
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(302, 600);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Raca/Cor:Amarela
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(359, 600);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Raca/Cor:Parda
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(448, 600);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Raca/Cor:Ignorado
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(507, 600);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Raca/Cor:Indígena
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(230, 590);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Raca/Cor:Indígena QUAL
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(398, 590);
			pageContentByte.showText("PAPACU DA CABEÇA AMARELA");
			pageContentByte.endText();
                        
                        //É membro de povo ou comunidade tradicional? SIM
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(247, 578);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //É membro de povo ou comunidade tradicional? NAO
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(289, 578);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //É membro de povo ou comunidade tradicional? Se sim, qual?
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(403, 578);
			pageContentByte.showText("KILO BOLA");
			pageContentByte.endText();
                        
                        //Estado de residência:S
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(114, 566);
			pageContentByte.showText("S");
			pageContentByte.endText();
                        
                        //Estado de residência:P
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(127, 566);
			pageContentByte.showText("P");
			pageContentByte.endText();
                        
                        //Município de Residência:
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(262, 566);
			pageContentByte.showText("CACHOEIRA PTA");
			pageContentByte.endText();
                        
                        //CEP:1
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(430, 566);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CEP:2
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(443, 566);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CEP:3
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(457, 566);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CEP:4
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(470, 566);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CEP:5
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(483, 566);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CEP:6
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(498, 566);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CEP:7
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(511, 566);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //CEP:8
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(525, 566);
			pageContentByte.showText("8");
			pageContentByte.endText();
                        
                        //Logradouro:
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(75, 554);
			pageContentByte.showText("RUA QUALQUER COISA RUA");
			pageContentByte.endText();
                        
                        //Número:
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(324, 554);
			pageContentByte.showText("1234567890");
			pageContentByte.endText();
                        
                        //Bairro:
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(438, 554);
			pageContentByte.showText("VILAVILA");
			pageContentByte.endText();
                        
                        //Complemento:
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(83, 543);
			pageContentByte.showText("CASA");
			pageContentByte.endText();
                        
                        //Telefone 1:
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(73, 532);
			pageContentByte.showText("9999999999999");
			pageContentByte.endText();
                        
                        //Telefone 2:
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(333, 532);
			pageContentByte.showText("9999999999999");
			pageContentByte.endText();
                        
                        //E-mail:
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(55, 520);
			pageContentByte.showText("ZAZAZAZAZA@ZZZZZZZZ.COM");
			pageContentByte.endText();
                        
                        //Estratégia:Diagnóstico assistencial (sintomático)
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(125, 486);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Busca ativa de assintomático 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(295, 486);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Busca ativa de Triagem de população específica
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(436, 486);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se busca ativa de assintomático: Monitoramento de contatos
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(125, 474);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se busca ativa de assintomático: Investigação de surtos
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(125, 463);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se busca ativa de assintomático: Monitoramento de viajantes com risco de VOC (quarentena)
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(125, 453);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se busca ativa de assintomático: Outro
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(125, 430);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se busca ativa de assintomático: Outro txt
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(165, 430);
			pageContentByte.showText("ABCDEFGHI");
			pageContentByte.endText();
                        
                        //Se triagem de população específica:Trabalhadores de serviços essenciais ou estratégicos
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(359, 474);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se triagem de população específica:Profissionais de saúde
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(359, 463);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se triagem de população específica:Gestantes e puérperas
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(359, 453);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se triagem de população específica:Povos e comunidades tradicionais
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(359, 442);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se triagem de população específica:Outro:
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(359, 430);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se triagem de população específica:Outro:txt
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(399, 430);
			pageContentByte.showText("ABCDEFGHIX");
			pageContentByte.endText();
                        
                        //Local de realização da testagem:Serviço de saúde (UBS, hospital, UPA etc.)
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(125, 419);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Local de realização da testagem:Local de trabalho
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(309, 419);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Local de realização da testagem:Aeroporto
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(437, 419);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Local de realização da testagem:Farmácia ou drogaria
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(125, 408);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Local de realização da testagem: Escola
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(309, 408);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Local de realização da testagem:  Domicílio ou comunidade
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(437, 408);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Local de realização da testagem:Outro:
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(125, 397);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Local de realização da testagem:Outro:TXT
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(165, 397);
			pageContentByte.showText("ABCDEFGHIX");
			pageContentByte.endText();
                        
                        //Sintomas:Assintomático
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(89, 363);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sintomas:Febre
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(175, 363);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sintomas:Dor de Garganta
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(288, 363);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sintomas:Dispneia
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(394, 363);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sintomas: Tosse
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(458, 363);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sintomas: Coriza
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(514, 363);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sintomas:Dor de cabeça
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(89, 352);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sintomas:Distúrbios gustativos
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(175, 352);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sintomas:Distúrbios olfativos
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(288, 352);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sintomas:Outros
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(394, 352);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Sintomas:Outros txt
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(434, 352);
			pageContentByte.showText("ABCDEFGHIX");
			pageContentByte.endText();
                        
                        //Data do início dos sintomas:DIA
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(138, 340);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Data do início dos sintomas:MES
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(154, 340);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Data do início dos sintomas:ANO
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(170, 340);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //Condições: Doenças cardíacas crônicas
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(337, 329);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Condições: Diabetes
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(493, 329);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Condições: Doenças respiratórias crônicas descompensadas
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(32, 318);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Condições: Puérpera (até 45 dias do parto)
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(337, 318);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Condições:  Gestante
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(493, 318);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Condições: Doenças renais crônicas em estágio avançado (graus 3, 4 e 5)
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(32, 307);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Condições:  Imunossupressão
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(337, 307);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Condições: Obesidade
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(493, 307);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Condições:Portador de doenças cromossômicas ou estado de fragilidade imunológica
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(32, 296);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Condições: Outros
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(337, 296);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Condições: Outros TXT
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(377, 296);
			pageContentByte.showText("ABCDEFGHIX");
			pageContentByte.endText();
                        
                        //Recebeu vacina Covid-19? S
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(32, 251);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Recebeu vacina Covid-19? N
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(68, 251);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Se recebeu vacina Covid-19, informar:Data da vacinação D1
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(309, 262);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Se recebeu vacina Covid-19, informar:Data da vacinação M1
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(326, 262);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Se recebeu vacina Covid-19, informar:Data da vacinação A1
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(342, 262);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //Se recebeu vacina Covid-19, informar:Laboratório produtor da vacina1
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(380, 262);
			pageContentByte.showText("FIOCRUZ");
			pageContentByte.endText();
                        
                        //Se recebeu vacina Covid-19, informar:Lote da vacina1
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(506, 262);
			pageContentByte.showText("123456789");
			pageContentByte.endText();
                        
                        //Se recebeu vacina Covid-19, informar:Data da vacinação D2
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(309, 251);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Se recebeu vacina Covid-19, informar:Data da vacinação M2
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(326, 251);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Se recebeu vacina Covid-19, informar:Data da vacinação A2
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(342, 251);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //Se recebeu vacina Covid-19, informar:Laboratório produtor da vacina2
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(380, 251);
			pageContentByte.showText("FIOCRUZ");
			pageContentByte.endText();
                        
                        //Se recebeu vacina Covid-19, informar:Lote da vacina2
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(506, 251);
			pageContentByte.showText("123456789");
			pageContentByte.endText();
                        
                        //RT-PCR Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 205);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-PCR Coletado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 205);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-PCR Concluído 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 194);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-PCR Não Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 194);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-PCR Data da coleta D 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(317, 194);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //RT-PCR Data da coleta M 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(332, 194);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //RT-PCR Data da coleta A 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(348, 194);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //RT-PCR Resultado Não detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 205);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-PCR Resultado Detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(487, 205);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-PCR Resultado Inconclusivo ou Indeterminado
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 194);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-LAMP Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 182);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-LAMP Coletado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 182);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-LAMP Concluído 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 171);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-LAMP Não Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 171);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-LAMP Data da coleta D 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(317, 171);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //RT-LAMP Data da coleta M 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(332, 171);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //RT-LAMP Data da coleta A 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(348, 171);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //RT-LAMP Resultado Não detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 182);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-LAMP Resultado Detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(487, 182);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //RT-LAMP Resultado Inconclusivo ou Indeterminado
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 171);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgA Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 159);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgA Coletado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 159);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgA Concluído 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 148);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgA Não Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 148);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgA Data da coleta D 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(317, 148);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Teste sorológico IgA Data da coleta M 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(332, 148);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Teste sorológico IgA Data da coleta A 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(348, 148);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //Teste sorológico IgA Resultado Não detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 159);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgA Resultado Detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(487, 159);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgA Resultado Inconclusivo ou Indeterminado
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 148);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgM Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 136);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgM Coletado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 136);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgM Concluído 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 125);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgM Não Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 125);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgM Data da coleta D 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(317, 125);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Teste sorológico IgM Data da coleta M 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(332, 125);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Teste sorológico IgM Data da coleta A 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(348, 125);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //Teste sorológico IgM Resultado Não detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 136);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgM Resultado Detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(487, 136);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgM Resultado Inconclusivo ou Indeterminado
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 125);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgG Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 113);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgG Coletado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 113);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgG Concluído 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 102);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgG Não Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 102);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgG Data da coleta D 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(317, 102);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Teste sorológico IgG Data da coleta M 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(332, 102);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Teste sorológico IgG Data da coleta A 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(348, 102);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //Teste sorológico IgG Resultado Não detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 113);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgG Resultado Detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(487, 113);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico IgG Resultado Inconclusivo ou Indeterminado
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 102);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico – anticorpos totais Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 90);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico – anticorpos totais Coletado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 90);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico – anticorpos totais Concluído 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 79);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico – anticorpos totais Não Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 79);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico – anticorpos totais Data da coleta D 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(317, 79);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Teste sorológico – anticorpos totais Data da coleta M 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(332, 79);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Teste sorológico – anticorpos totais Data da coleta A 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(348, 79);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //Teste sorológico – anticorpos totais Resultado Não detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 90);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico – anticorpos totais Resultado Detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(487, 90);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste sorológico – anticorpos totais Resultado Inconclusivo ou Indeterminado
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 79);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgM Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 67);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgM Coletado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 67);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgM Concluído 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 56);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgM Não Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 56);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgM Data da coleta D 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(317, 56);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgM Data da coleta M 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(332, 56);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgM Data da coleta A 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(348, 56);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgM Resultado Não detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 67);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgM Resultado Detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(487, 67);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgM Resultado Inconclusivo ou Indeterminado
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 56);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgG Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 44);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgG Coletado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 44);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgG Concluído 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(132, 33);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgG Não Solicitado 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(220, 33);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgG Data da coleta D 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(317, 33);
			pageContentByte.showText("31");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgG Data da coleta M 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(332, 33);
			pageContentByte.showText("12");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgG Data da coleta A 
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(348, 33);
			pageContentByte.showText("2021");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgG Resultado Não detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 44);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgG Resultado Detectável
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(487, 44);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        //Teste rápido de anticorpo IgG Resultado Inconclusivo ou Indeterminado
			pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(387, 33);
			pageContentByte.showText("X");
			pageContentByte.endText();
                        
                        
                    
		  
		    pdfStamper.close();	
 
		    System.out.println("Gerou pag1");
		} catch (Exception e) {
		    e.printStackTrace();
		}
    
}
}
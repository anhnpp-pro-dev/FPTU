package fu.util.test;

import fu.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KING (Nguyễn Phan Phước Anh)
 */
public class NewEmptyJUnitTest {

    //Mình sẽ test các tình huống caif hamf getFactorial() ở đây 
    //Tình huống là tham số dưa vào: dương, âm, dương trong khoảng 0..20, ngoài 
    //Tình huống cài hàm, test hàm gọi là TEST CASES
    //Thường ta có tình huống thành công và thất bại
    //Thành công: đưa vào value hợp lệ 0..20
    //Thất bại: đưa vào âm, > 20, bị ăn đòn
    //Hàm phải bắt các tình huống này và giờ ta test thử coi hàm xử lí đúng không
    @Test //Biến hàm này thành public static void main()
    //Quy tắt đặt tên hàm cho việc test phần mềm: rất nhiều quy tắc
    //Nhưng nói chung teem hàm sẽ bao gồm ngữ nghĩa kết quả trả về, tình trạng t
    //Khoongg giống quy tắt đặt tên hàm trong viết code
    public void getFactorial_RunWell_IfValidArgument() {
        assertEquals(720, MathUtility.getFactorial(6));
        //Check có đúng là hàm 6 giai thừa có đúng là 720 hay không ?
        //có XANH, không ĐỎ
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
    }

}
//MẶC ĐỊNH CODE TEST ĐỘC LẬP VỚI CODE CHÍNH
//ĐỘC LẬP VỚI QUÁ TRÌNH CLEAN&BUILD, TỨC LÀ DÙ CODE XANH HAY ĐỎ 
//MIỄN LÀ KHÔNG BỊ ERROR CÚ PHÁP
//BẠN LUÔN ĐÓNG GÓI BUILD RA ĐƯỢC FILE .JAR .WAR (BẤT CHẤP XANH ĐỎ)

//HỢP LOGIC THIFI MÀU XANH, TỨC LÀM HÀM CHUẨN THÌ MỚI NÊN RA ĐƯỢC .JAR .WAR
//VẬY TA CẦN CÓ 1 CÁCH GÀI XANH ĐỎ VÀO QUY TRÌNH BUIILD .JAR .WAR
//CÁCH KHÁC: NẾU CODE TEST ĐANG MÀU ĐỎ THÌ DISABLE CÀI NÚT BẤM CLEAN&BUILD

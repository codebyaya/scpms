package com.specialcook.service;

import com.specialcook.model.Invoice;
import com.specialcook.model.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BillingService {

    private final List<Invoice> invoices;

    public BillingService() {
        this.invoices = new ArrayList<>();
    }

    /**
     * إنشاء فاتورة بناءً على الطلب.
     *
     * @param order الطلب الذي تم إنشاؤه من قبل العميل
     * @return الفاتورة الناتجة
     */
    public Invoice generateInvoice(Order order) {
        double total = order.calculateTotal();
        Invoice invoice = new Invoice(order.getOrderId(), order.getCustomerName(), total, LocalDate.now());
        invoices.add(invoice);
        System.out.println("💰 Invoice generated: " + invoice);
        return invoice;
    }

    /**
     * الحصول على جميع الفواتير التي تم إنشاؤها.
     *
     * @return قائمة الفواتير
     */
    public List<Invoice> getAllInvoices() {
        return invoices;
    }

    /**
     * حساب إجمالي الإيرادات من جميع الفواتير.
     *
     * @return مجموع الإيرادات
     */
    public double calculateTotalRevenue() {
        return invoices.stream().mapToDouble(Invoice::getAmount).sum();
    }

    /**
     * توليد تقرير مالي بسيط.
     *
     * @return نص التقرير
     */
    public String generateFinancialReport() {
        StringBuilder report = new StringBuilder();
        report.append("📊 Financial Report\n");
        report.append("Total Invoices: ").append(invoices.size()).append("\n");
        report.append("Total Revenue: $").append(calculateTotalRevenue()).append("\n");
        return report.toString();
    }
}

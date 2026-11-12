# Bài 5: Test Coverage & Quality Enforcement (JaCoCo)

Repo: https://github.com/<user>/<repo>

## Nội dung đã thực hiện

- `pom.xml`: tích hợp `jacoco-maven-plugin` (prepare-agent, report, check).
  - Rule nghiêm ngặt: `LINE COVEREDRATIO >= 0.80`, nếu thấp hơn thì **build fail**.
- `.github/workflows/ci.yml`: chạy `mvn clean verify` trên GitHub Actions
  và dùng `actions/upload-artifact` để lưu báo cáo `target/site/jacoco/`.

## Chạy ở máy

```bash
mvn clean verify
```

Báo cáo: `target/site/jacoco/index.html`

## Minh chứng

- Run thành công: <dán link run ✅>
- Run fail khi coverage < 80% (đặt tạm minimum = 0.99): <dán link run ❌>
- Coverage hiện tại: XX% (xem báo cáo JaCoCo sau khi chạy `mvn clean verify`)
- Ảnh chụp: thư mục `docs/` (nếu có)

## Cách kiểm chứng rule fail build

Đổi `<minimum>0.80</minimum>` thành `0.99` trong `pom.xml`, thêm một method chưa có test
(hoặc xóa bớt test) rồi chạy `mvn clean verify` -> `BUILD FAILURE`. Sau đó khôi phục.
